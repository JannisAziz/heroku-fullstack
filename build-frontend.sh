mkdir -p target/classes/static

cd ../frontend
npm install && npm run build
cd ..

#cp -r ./frontend/build/* ./backend/target/classes/static
cp -r ./frontend/build/* ./backend/src/main/resources/static